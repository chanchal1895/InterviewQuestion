package ConstructorConcept;

public class ParentChildConstCallsBySuper {

}

//Case 1 ---P1(){super();} and C1(){super();} are hidden.Provided by compiler.
class P1 {

}

class C1 extends P1 {

}

//case 2--C2(){super();}--hidden.Provided by compiler.

class P2 {
	P2() {

	}
}

class C2 extends P2 {

}

//case 3---C3(){super();}--hidden.Provided by compiler.
class P3 {
	P3(int i) {

	}
}

///it is give compile time error because child class C3 have
//default costructor C3(){super();} given by compiler and super();
// is calling no args constructor of Parent class which is not explicitly 
//	written.
class C3 extends P3 {
}

//to make solve it 
//case1
class C4 extends P3 {
	C4() {
		super(10);
	}
}

//case 2
class P4 {
	P4(int i) {

	}

	P4() {

	}
}

class C5 extends P4 {

}
