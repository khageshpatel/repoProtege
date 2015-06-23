## Final Proposed Syntex ##

#### This is proposed syntex for creating a new relation

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
		
		<!-- These tags will define new rules for creating or deleting relationshipd like a part with edge length one is a direct part. A relation can have multiple creation rule. --> 
		<relAxiom:createRelation>
			<!-- Declare a createRelation rule -->
		</relAxiom:createRelation>

		<!-- These tags will define rules for defining restriction in relation  like a cranckcase can be part of atmost one engine. A relation can have multiple restriction rules.-->
		<relAxiom:restrict>
			<relAxiom:restrictRule>
				<!-- Actual restriction rule -->
			</relAxiom:restrictRule>
			<relAxiom:restrictMessage>
				<!-- Message to be displayed when this rile is violated -->
			</relAxiom:restrictMessgae>
		<relAxiom:restrcit> 


</rel:NewRelation>
```