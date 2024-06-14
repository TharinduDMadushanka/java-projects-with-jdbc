package Controller;

import Dto.ItemDto;
import Model.ItemModel;

import java.util.ArrayList;

public class ItemController {
    private ItemModel itemModel;

    public ItemController() throws Exception{
        this.itemModel = new ItemModel();
    }

    public String saveItem(ItemDto itemDto) throws Exception{
        String resp = itemModel.saveItem(itemDto);
        return resp;
    }

    public ArrayList<ItemDto> getAllItem() throws Exception{
        ArrayList<ItemDto> itemDtos = itemModel.getAllItem();
        return itemDtos;
    }
    public ItemDto searchItem(String itemId)throws Exception{
        ItemDto itemDto =itemModel.getItem(itemId);
        return itemDto;
    }
    public String deleteItem(String itemCode) throws Exception{
        String resp = itemModel.deleteItem(itemCode);
        return resp;
    }
    public String updateItem(ItemDto itemDto)throws Exception{
        String resp = itemModel.updateItem(itemDto);
        return resp;
    }

}
