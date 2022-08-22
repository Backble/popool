package kr.co.popool.bblpayment.service;

import kr.co.popool.bblpayment.domain.dto.ItemDto;

import java.util.List;

public interface ItemMstService {

    public void enrollItem(ItemDto.CREATE createDto);
    public List<ItemDto.READ> findAllItems();
    public ItemDto.DETAIL findItemDetail(Long itemId);
    public void updateItem(Long itemId);
    public void deleteItem(Long itemId);
}
