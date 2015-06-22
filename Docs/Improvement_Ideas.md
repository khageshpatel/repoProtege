## Curent Report ##

#### What has been done?

- New syntax for owl which can be parsed by OWLAPI and protege.
  ```
      	<rel:NewRelation rdf:about="#PartOf"/>
  ```
  ```
	<owl:Class rdf:about="#Finger">
  <rel:PartOf rdf:resource="#Hand"/>
    </owl:Class>
  ```

- UI changes in protege to create new relation and relationships.

- Visualization of newly created relations.

- Making changes in writer of protege so user created relations can be stored in   
user specified files.

- Some data-structure and api introduction so others programs like hermit can make use of it.

- All codes relating to this can be found [here](https://github.com/khageshpatel/repoProtege "My git repository").

#### Some features that we can implement

- Current OWL can't  represent reflexive, anti-reflexive and anti-symmetric. 

- There are no variables in owl, we can implement variable mechanism [This is not so important].

- Relation Axioms
	* Different relation support like if part of something has fault then that thing will also have fault.
	* In OWL 1  does not support relation axiom. OWL 2 supports property chains but it also has many limitations like it cannot express the relation child of married parents. Although SWRL rules extend OWL 2 capability to define relation axioms somehow they also have some limitations like there is no support for chain length hence we cannot define `direct-PartOf` as something that is `partOf` some object with chain length exactly 1. More information about this can be found [here](http://dior.ics.muni.cz/~makub/owl/ "SWRL rules").  Similar is the case of `properPartOf`. Possible improvements we can have are:
		+  Relation to complement of a class to support open world assumption of OWL.
		+  Partial Ordering and non monotonic inferences.
		+  Reasoners exist for only DL safe swirl rules because otherwise reasoner may become undecidable but by separating relations to object property we may introduce some more set of axiom without breaking undecidability of reasoner. DL safe rules can only bind named individuals.
		+  SWRL does not support negated atom or disjunction which can be supported.
		+   Support for negation as failure.
		+   Cardinality in transitive relations because cardinality is not supported in transitive relations. 
	* Support for complement, union, negation, intersection.
	* Support for custom restrictions like in case of transitive properties for example if we want to say that a car engine can have at most one chamber.

#### Benefit of doing all this 

- Representing knowledge that can't be represented earlier.

- There are drawbacks of workaround to represent relations using object properties like creating new classes which are stressful for reasoner. By declaration relationships as separate entities these can be avoided.