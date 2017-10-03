package com.view;

import java.util.ArrayList;

import oracle.adf.view.rich.component.rich.output.RichOutputText;
import java.util.List;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class RanderImage_Bean {
    
    private RichInputText employeeRating;

    private List<String> eachStar ;
    public RanderImage_Bean() {
    }

    public void setEmployeeRating(RichInputText employeeRating) {
        this.employeeRating = employeeRating;
    }

    public RichInputText getEmployeeRating() {
        return employeeRating;
    }
    
    public List getStarRating(){
        
        int rating = Integer.parseInt(getEmployeeRating().getValue().toString());
        ArrayList al = new ArrayList();
        
        if(rating> 2400 && rating< 7000){
                al.add("star0.png");
            }else if(rating> 7000 && rating< 9000){
                al.add("star0.png");
                al.add("star1.png");
            }else if(rating> 7000 && rating<= 9000){
                al.add("star0.png");
                al.add("star1.png");
                al.add("star2.png");
            }else if(rating> 9001 && rating< 17001){
                al.add("star0.png");
                al.add("star1.png");
                al.add("star2.png");
                al.add("star3.png");
            }else if(rating> 17002 && rating<= 50000){
                al.add("star0.png");
                al.add("star1.png");
                 al.add("star2.png");
                al.add("star3.png");
                 al.add("star4.png");}
//            setEachStar
        return al;
        
        }


    public void setEachStar(List<String> eachStar) {
        this.eachStar = eachStar;
    }

    public List<String> getEachStar() {
        return eachStar;
    }
}
