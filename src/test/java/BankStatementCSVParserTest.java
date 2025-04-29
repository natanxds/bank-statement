import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankStatementCSVParserTest {

    private final BankStatementCSVParser statementCSVParser = new BankStatementCSVParser();

    @Test
    public void shouldParserOneCorrectLine() {
        // Given
        final String line = "30-01-20,100.0,Deposit";
        final List<String> lines = Collections.singletonList(line);

        // When
        final List<BankTransaction> result = statementCSVParser.parseLinesFromCsv(lines);

        // Then
        assertEquals(1, result.size());
        final BankTransaction transaction = result.get(0);
        assertEquals(LocalDate.of(2020, Month.JANUARY, 30), transaction.getDate());
        assertEquals(100.0, transaction.getAmount());
        assertEquals("Deposit", transaction.getDescription());
    }
}