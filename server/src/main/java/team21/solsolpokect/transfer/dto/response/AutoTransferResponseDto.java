package team21.solsolpokect.transfer.dto.response;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AutoTransferResponseDto {

    private long autoTransferId;
    private int money;
    private LocalDateTime autoDate;
    private int childAccount;
}
