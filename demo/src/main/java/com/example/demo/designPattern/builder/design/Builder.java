package com.example.demo.designPattern.builder.design;

import com.example.demo.designPattern.builder.matter.ceilling.LevelOneCeilling;
import com.example.demo.designPattern.builder.matter.ceilling.LevelTwoCeilling;
import com.example.demo.designPattern.builder.matter.coat.DuluxCoat;
import com.example.demo.designPattern.builder.matter.coat.LiBangCoat;
import com.example.demo.designPattern.builder.matter.floor.ShengXiangFloor;
import com.example.demo.designPattern.builder.matter.tile.DongPengTile;
import com.example.demo.designPattern.builder.matter.tile.MarcoPoloTile;

public class Builder {

    public IMenu levelOne(Double area){
       return new DecorationPackageMenu(area, "豪华装修").
               appendCeiling(new LevelTwoCeilling()).
               appendCoat(new DuluxCoat()).appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园").
                appendCeiling(new LevelTwoCeilling()).
                appendCoat(new LiBangCoat()).appendFloor(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约").
                appendCeiling(new LevelOneCeilling()).
                appendCoat(new LiBangCoat()).appendFloor(new DongPengTile());
    }
}
