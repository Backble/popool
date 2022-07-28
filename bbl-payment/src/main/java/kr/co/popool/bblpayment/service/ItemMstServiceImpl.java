package kr.co.popool.bblpayment.service;

import kr.co.popool.bblcommon.error.exception.NotFoundException;
import kr.co.popool.bblpayment.domain.dto.ItemDto;
import kr.co.popool.bblpayment.domain.entity.ItemMstEntity;
import kr.co.popool.bblpayment.repository.ItemMstRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ItemMstServiceImpl implements ItemMstService{

    private final ItemMstRepository itemMstRepository;

    @Override
    public void enrollItem(ItemDto.CREATE createDto) {

    }

    @Override
    public List<ItemDto.READ> findAllItems() {
        return null;
    }

    @Override
    public ItemDto.DETAIL findItemDetail(Long itemId) {
        return null;
    }

    @Override
    public void updateItem(Long itemId) {

    }

    @Override
    public void deleteItem(Long itemId) {

    }
}
