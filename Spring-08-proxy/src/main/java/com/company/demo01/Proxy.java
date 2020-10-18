package com.company.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Proxy implements Rent{

    private Host host;

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        heTong();
        fare();
    }

    public void seeHouse(){
        System.out.println("中介带你看房！");
    }

    public void fare(){
        System.out.println("收中介费！");
    }
    public void heTong(){
        System.out.println("签租赁合同！");
    }

}
