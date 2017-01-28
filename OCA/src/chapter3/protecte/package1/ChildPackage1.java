package chapter3.protecte.package1;

public class ChildPackage1 extends ParentPackage1{

	public void  protectedAcessUsingInheritance() {
		ChildPackage1 child=new ChildPackage1();
		child.setMember1("Hellow");
		System.out.println(child.member1);
		child.setMember2("Hi");
		System.out.println(child.getMember2());
		
	}
	
	public void  protectedAcess() {
		setMember1("Sample 1");
		System.out.println(member1);
		setMember2("Sample2");
		System.out.println(getMember2());
		
	}
	
	public void  protectedAcessAsParent () {
		ParentPackage1 parent=new ParentPackage1();
		parent.setMember1("Sample 3");
		System.out.println(parent.member1);
		parent.setMember2("Sample 4");
		System.out.println(parent.getMember2());
		
	}
	public void protectedAcessUsingParentReference() {
		ParentPackage1 parent=new ChildPackage1();
		parent.setMember1("Sample 3");
		System.out.println(parent.member1);
		parent.setMember2("Sample 4");
		System.out.println(parent.getMember2());
	}
	
	public static void main(String[] args) {
		
	}
}
