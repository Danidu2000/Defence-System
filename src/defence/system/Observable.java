/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system;

import java.util.ArrayList;

/**
 *
 * @author danid
 */
public class Observable implements ObservableInterface{
    private boolean areaClear;
    private String commanMsg;
    private String subMassage;
    private String heliMassage;
    private String tankMassage;
    private String subText;
    private String tankText;
    private String heliText;
    private int position;
    private String[] subInfoarray;
    private String[] heliInfoarray;
    private String[] tankInfoarray;
	final ArrayList<Observer>observerList=new ArrayList<>();
	
	public void addObserver(Observer ob){
		observerList.add(ob);
	}	
	
    @Override
	public void setAreaClear(boolean areaClear){
            if(this.areaClear!=areaClear){
                this.areaClear=areaClear;
                notifyObject();
            }
	}
    @Override
        public void setCommanText(String commanMsg){
            this.commanMsg=commanMsg;
            notifyObject();
        }
    @Override
        public void setSubInfo(String[] subInfoarray){
            this.subInfoarray=subInfoarray;
            notifyObject(0);
        }
    @Override
        public void setHeliInfo(String[] heliInfoarray){
            this.heliInfoarray=heliInfoarray;
            notifyObject(0,0);
        }
    @Override
        public void setTankInfo(String[] tankInfoarray){
            this.tankInfoarray=tankInfoarray;
            notifyObject(0,0,0);
        }
    @Override
        public void setsubMassage(String Massage){
            this.subMassage = Massage;
            notifyObject(0.1);
        }
    @Override
        public void setheliMassage(String Massage){
            this.heliMassage = Massage;
            notifyObject(0.1,0.1);
        }
    @Override
        public void settankMassage(String Massage){
           this.tankMassage = Massage;
            notifyObject(0.1,0.1,0.1); 
        }
    @Override
        public void setPosition(int position){
            this.position = position;
            notifyObject(1,0.1);
        }
    @Override
        public void setsubText(String text){
            this.subText = text;
            notifyObject(1,1,0.1);
        }
    @Override
        public void settankText(String text){
           this.tankText = text;
           notifyObject(1,1,1,0.1); 
        }
    @Override
        public void heliText(String text){
          this.heliText = text;
           notifyObject(1,1,1,1,0.1);   
        }
        
        
        
        
	
	public void notifyObject(){
		for(Observer ob : observerList){
                   ob.update(areaClear,commanMsg);
		}
	}
        public void notifyObject(int a){
		for(Observer ob : observerList){
                    ob.update(subInfoarray);
		}
	}
        public void notifyObject(int a,int b){
		for(Observer ob : observerList){
                    ob.update(heliInfoarray,0);
		}
	}
        public void notifyObject(int a,int b,int c){
		for(Observer ob : observerList){
                    ob.update(tankInfoarray,0,0);
		}
	}
        public void notifyObject(double a){
		for(Observer ob : observerList){
                    ob.update(subMassage);
		}
	}
        public void notifyObject(double a,double b){
		for(Observer ob : observerList){
                    ob.update(heliMassage,0.1);
		}
	}
        public void notifyObject(double a,double b,double c){
		for(Observer ob : observerList){
                    ob.update(tankMassage,0.1,0.1);
		}
	}
        public void notifyObject(int a,double b){
		for(Observer ob : observerList){
                   ob.update(position);
		}
	}
        public void notifyObject(int a,int c,double b){
		for(Observer ob : observerList){
                   ob.update(subText,1,0.1);
		}
	}
        public void notifyObject(int a,int c,int d,double b){
		for(Observer ob : observerList){
                   ob.update(tankText,1,1,0.1);
		}
	}
        public void notifyObject(int a,int c,int d,int e,double b){
		for(Observer ob : observerList){
                   ob.update(heliText,1,1,1,0.1);
		}
	}
}
