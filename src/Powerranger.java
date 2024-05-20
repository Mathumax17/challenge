class Powerranger {
 //attributes
 //syntax=type+name+value
 String Helmet;
 String Dress;
 String Colour;
 String Weapon;
 // syntax of constructor =className + (pass the attribute)+{this . attributeName=attributeName;}
 Powerranger(String Helmet,String Dress,String Colour,String Weapon){
  this.Helmet=Helmet;
  this.Dress=Dress;
  this.Colour=Colour;
  this.Weapon=Weapon;
 }
 void Attack(){
  System.out.println("Attack the Enemy");
 }
 void Jump(){
  System.out.println("Jump over Object");
 }
 void Power(){
  System.out.println("Using Power");
 }



 }