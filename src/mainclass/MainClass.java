/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainclass;

class LoginMethod {
        private int id;
        private String name, password;

public LoginMethod (int id,String name,String password  ){
           this.id = id;
           this.name =name;
           this.password = password;
       }
       
public void getInfo() {
           System.out.println("ID:" + this.id +" Name: "+this.name );
           System.out.println(" Password " + this.password);
       }
       
    }
    
    class employee extends LoginMethod  {
        public employee(int id,String name,String password  ){
            super( id, name, password);
        }
        
        public void getInfo() {
            super.getInfo();
            System.out.println("Employee Login");
        }
        
        
    
    }
    
    class admin extends LoginMethod  {
        public admin(int id,String name,String password  ){
            super( id, name, password);
        }
        
        public void getInfo() {
            super.getInfo();
            System.out.println("Admin Login");
        }
        
        
    
    }
    
    public class MainClass {
    public static void main(String[] args) {
        admin a = new admin (1,"admin","Password");
        employee e = new employee(1,"E1","Password");
        
        a.getInfo();
        e.getInfo();
        
      
    }
    }
