/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defence.system;

/**
 *
 * @author danid
 */
public interface ObservableInterface {
    public void setAreaClear(boolean areaClear);

    public void setCommanText(String commanMsg);

    public void setSubInfo(String[] subInfoarray);
    
    public void setHeliInfo(String[] heliInfoarray);
    
    public void setTankInfo(String[] tankInfoarray);

    public void setsubMassage(String Massage);

    public void setheliMassage(String Massage);

    public void settankMassage(String Massage);

    public void setPosition(int position);

    public void setsubText(String text);

    public void settankText(String text);

    public void heliText(String text);
}
