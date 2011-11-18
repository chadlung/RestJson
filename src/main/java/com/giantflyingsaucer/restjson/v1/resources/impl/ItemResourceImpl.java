package com.giantflyingsaucer.restjson.v1.resources.impl;

import com.giantflyingsaucer.restjson.v1.resources.Item;
import com.giantflyingsaucer.restjson.v1.resources.ItemResource;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Path;

// Set the path, version 1 of API
@Path("/v1/item")
public class ItemResourceImpl implements ItemResource{

    @Override
    public List<Item> getItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(100, "Widget", "A basic widget"));
        items.add(new Item(200, "SuperWidget", "A super widget"));
        items.add(new Item(300, "UberSuperWidget", "A uber super widget"));
        
        return items;
    }
}
