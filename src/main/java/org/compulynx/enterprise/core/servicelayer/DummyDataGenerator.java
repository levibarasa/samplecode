/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.compulynx.enterprise.core.servicelayer;

import java.util.LinkedList;
import java.util.List;
import org.compulynx.enterprise.core.businesslogiclayer.models.hierarchy.Field;
import org.compulynx.enterprise.core.businesslogiclayer.models.hierarchy.Item;
import org.compulynx.enterprise.core.businesslogiclayer.models.hierarchy.Structure;

/**
 *
 * @author Kimando
 */

public class DummyDataGenerator
{
    public List<Field> generateFields(int start, int end)
    {
        List<Field> fields = new LinkedList<>();
        
        for(int i = start; i < end; i++)
        {
            Field field = new Field();
            field.setName("Field "+i);
            field.setType("Text");
            field.setMandatory(true);
            field.setMaxLength(50);
                
            fields.add(field);
        }
        
        return fields;
    }
    
    public List<Item> generateItems(int start, int end, List<Field> fields)
    {
        List<Item> items = new LinkedList<>();
        
        for(int i = start; i < end; i++)
        {
            Item item = new Item();
            item.setId(i);
            item.setName("Item "+i);
            item.setFields(fields);
                
            items.add(item);
        }
        
        return items;
    }
    
    public List<Structure> generateStructures(int start, int end, List<Field> fields, List<Item> items)
    {
        List<Structure> structures = new LinkedList<>();
        
        for(int i = start; i < end; i++)
        {
            Structure structure = new Structure();
            structure.setId(i);
            structure.setName("Structure "+i);
            structure.setFields(fields);
            structure.setItems(items);
                
            structures.add(structure);
        }
        
        return structures;
    }
}
