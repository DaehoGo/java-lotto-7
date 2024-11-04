package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LottoGeneratorTest {

    @DisplayName("로또 번호 생성 시 6개의 번호가 1~45 범위 내에서 생성된다.")
    @Test
    void 로또_번호가_정상적으로_생성된다() {
        // given & when
        List<Integer> lottoNumbers = LottoGenerator.generateLottoNumbers();
        // then
        assertThat(lottoNumbers).hasSize(6);
        assertThat(lottoNumbers).allMatch(number -> number >= 1 && number <= 45);
    }
}
