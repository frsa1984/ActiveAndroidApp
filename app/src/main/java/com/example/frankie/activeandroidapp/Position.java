package com.example.frankie.activeandroidapp;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by Frankie on 12/4/2016.
 */

@Table(name="Position")
public class Position extends Model {

    @Column(name="PositionName")
    public String PositionName;

    public static List<Position> getAllPositions(){
        return new Select().from(Position.class).execute();
    }

}
