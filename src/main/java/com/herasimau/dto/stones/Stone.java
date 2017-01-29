package com.herasimau.dto.stones;

import com.herasimau.dto.Element;
import com.herasimau.dto.Manufacturer;

import javax.persistence.*;

/**
 * Created by herasimau on 29/01/17.
 */
@Entity
public class Stone extends Element {

    public Stone(){
        super();
    }

    public Stone(double weight, String name, Manufacturer manufacturer, StoneType type, StoneColor color) {
        super(weight, name, manufacturer);
        this.type = type;
        this.color = color;
    }

    @Enumerated(EnumType.STRING)
    private StoneType type;
    @Enumerated(EnumType.STRING)
    private StoneColor color;

    public StoneType getType() {
        return type;
    }

    public void setType(StoneType type) {
        this.type = type;
    }

    public StoneColor getColor() {
        return color;
    }

    public void setColor(StoneColor color) {
        this.color = color;
    }

}
