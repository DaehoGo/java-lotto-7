package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WinningLottoTest {

    @DisplayName("올바른 당첨 번호와 보너스 번호 입력 시 예외가 발생하지 않고 저장된다.")
    @Test
    void 올바른_당첨_번호와_보너스_번호_입력() {
        // given
        String validWinningNumbers = "1,2,3,4,5,6";
        String validBonusNumber = "7";
        // when
        WinningLotto winningLotto = new WinningLotto(validWinningNumbers, validBonusNumber);
        // then
        assertThat(winningLotto.getNumbers()).containsExactly(1, 2, 3, 4, 5, 6);
        assertThat(winningLotto.getBonusNumber()).isEqualTo(7);
    }
}
