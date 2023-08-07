class One {
    // super class var
    int i = 10;

    // super class method
void show()
{

System.out.println( “super class method:i=” +i );
}
}

class Two extends One {
    // sub class var
    int i = 20;

    // sub class method
void show()
{

System.out.println( “sub class method:i=” +i );
// using super to call super class method
super.show();
// using super to access super class var

System.out.println (“super :i=” + super.i );
}
}

class Super1 {
    public static void main(String args[]) {
        // create sub class object
        Two t = new Two();
        // this will call sub class method only
        t.show();
    }
}