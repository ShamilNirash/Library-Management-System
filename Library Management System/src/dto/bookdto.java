  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author ASUS
 */
public class bookdto {
    private String name;
    private String authname;
    private boolean isAvailable;

    public bookdto(String name, String authname, boolean isAvailable) {
        this.name = name;
        this.authname = authname;
        this.isAvailable = isAvailable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthname(String authname) {
        this.authname = authname;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
 
    public String getName() {
        return name;
    }

    public String getAuthname() {
        return authname;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

}
