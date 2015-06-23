## Final Proposed Syntax ##

### This is proposed syntax for creating a new relation

```xml
<rel:NewRelation rdf:about="#PartOf">
		<!-- Optional relation type declaration include one or more -->
        <rel:type rdf:resource="&owl;AsymmetricRelation"/>
        <rel:type rdf:resource="&owl;FunctionalRelation"/>
        <rel:type rdf:resource="&owl;InverseFunctionalRelation"/>
        <rel:type rdf:resource="&owl;IrreflexiveRelation"/>
        <rel:type rdf:resource="&owl;ReflexiveRelation"/>
        <rel:type rdf:resource="&owl;SymmetricRelation"/>
        <rel:type rdf:resource="&owl;TransitiveRelation"/>
		
		<!-- These tags will define new rules for creating or deleting relationship like a part with edge length one is a direct part. A relation can have multiple creation rule. --> 
		<relAxiom:createRelation>
			<!-- Declare a createRelation rule -->
		</relAxiom:createRelation>

		<!-- These tags will define rules for defining restriction in relation  like a crankcase can be part of at most one engine. A relation can have multiple restriction rules.-->
		<relAxiom:restrict>
			<relAxiom:restrictRule>
				<!-- Actual restriction rule -->
			</relAxiom:restrictRule>
			<relAxiom:restrictMessage>
				<!-- Message to be displayed when this rile is violated -->
			</relAxiom:restrictMessgae>
		<relAxiom:restrict> 


</rel:NewRelation>
```

### Proposed syntax for createRelation rule

+ There can be two type of rules:
	+ `Atom ^ Atom ... -> RelationDeclaration`
	+ `Atom ^ Atom ? RelationDeclaration : RelationDeclaration`
+ Atoms can be of following types:
	+ **Class Atom** This atom will declare that something is part of a class for example Person(?p) means that variable p is a person similarly Man(Fred) means that Fred is a man.
	+ **Relation Atom** This atom checks if two objects are related in case second argument is already known else gives a object related by a relation to first argument for example partOf(?x,?y) assert that variable x is partOf y.
	+ **Data Property Atom** This atom checks if a object has given value for a  property if second argument is already known else assigns given data property of first argument to second argument for example hasAge(?x,?age) asserts that variable x is linked to variable age by data property hasAge.
	+ **Utility Atoms**	There are other utility atoms to help us in various ways:
		+ *differentFrom(?x,?y)* checks if variable x and variable y are different.
		+ *sameAs(?x,?y)* checks if variable x and y are same.
		+ *edgeDistance(?x,?y,rel)* returns number of edges between variable x and y using relation rel. If not related return infinity.
		+ Arithmetic Methods like add, multiply, subtract. These are binding methods as they assign value to a variable.
		+ Logical operators like greaterThen, smallerThen, greOrEq, smallOrEq, equal
	+ Every variable can be complement of other atom using ComplementOf(). Every atom can be negation of other atom using negation().
	+ We can use disjunction instead of conjunction in left side of above rules.
	+ Any atom can be formed by conjunction of other atom.
	+ Count(?y,Atom) count number of variables y satisfying given Atom.
+ RelationDeclaration can be of two type:
	+ Simple declaration like partOf(?x,?y) declaring that variable x is partOf y.
	+ Set relation is used for setting a relation like setRelation(partOf(?x,?y),true). The utility of this atom is that it can even a already created relation thereby supporting non monotonic inferences in OWL.

### Use Cases

+ **directPartOf**

	`partOf(?x,?y) ^ equal(edgeDistance(?x,?y,partOf),1) -> directPartOf(?x,?y)`

+ **properPartOf**

	`partOf(?x,?y) ^ negation(sameAs(?x,?y)) -> properPartOf(?x,?y)`

+ If a part has fault whole object has fault

	`partOf(?x,?y) ^ hasFault(?x,true) -> hasFault(?y,true)`

### Proposed syntax for restrictRule

`Atom ^ Atom`

Types of atoms are similar to  above but in this case this acts as restriction and if this restriction is violated error message inside restrictMessage will be displayed.

### Use Cases

Here we will declare a restriction that that a crankcase can be part of at most one engine.

`smallerThen(count(crankcase,partOf(crankcase,?y)^engine(?y)),1)`

### Benefits of our approach

+ You can declare restriction that a crankcase can be part of only one object in current owl because partOf is transitive property so if crankcase is part of engine and engine is partOf cars then crankcase is partOf two objects so saying that crankcase is partOf at most one object does not make any sense in current OWL but you can define restriction with much more depth with out approach.
+ Current OWL combined with SWRL don't support Negation and Disjunction whereas our approach does support them. 
+ We support negation as failure whereas current OWL don't support them.
+ We support non monotonic inferences it means we can change already existing relation so we can delete relations on the run.
+ As we have created separate entity called relation we avoid drawbacks, high computation requirement and high memory requirement from work arounds.
+ Support for ReflexiveRelation, IrreflexiveRelation and AsymmetricRelation.
