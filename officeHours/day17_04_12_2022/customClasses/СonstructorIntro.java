package day17_04_12_2022.customClasses;

public class СonstructorIntro {
    /*

    What is Constr ?

    - It is a special method to init all instance Variables  for CURRENT OBJECT
    - Constructor name MUST be SAME with CLASSNAME
    - DOES NOT HAVE RETURN TYPE



    When it works ?

    - it works when you call it.

     ConstructorIntro c =  new ConstructorIntro();



     - Structure

            AccessModifier ClassName(){

            }

            public Car(){
               // No ARG Constr

            }


    Types of Constr


    No ARG Constr

         - if we dont create any CONSTR , Compiler will create DEFAULT Constr (with no param)

         - if you create CONSTR either with param OR not , compiler will not create it for you


     Parameterized Constr

        - if you want to init your instances , you need to pass your values as arg


         public class Rectangle {

            int length ;

            int width ;

            public Rectanlge(int length,int width){

            this.length=length;
            this.width=width ;

            }

            // Java prioritizes lcao variables
            // that s why we need to specify current Object instance cariable with this

         }


        Constructor Chaining --> calling One Constructor from Another

        - use this() to call another constr
        - it Must be in First Line for another Construct
        - cannot call more than One Constr with this()
        - cannot call itself

        This Vs This()

             this: refers current Object
                    this.instanceMethod()
                    this.instanceVar()

             this(): refers current Object Constructor. It can take parameters too

               Amazon

                user (M)                  UserInfo(user,password);
                password (M)              UserInfo(user,password,card);
                card (optional )
                address (Optional)
                DoB   (Optional)

               UserInfo(user,password,card,address,DoB);



     */
}
