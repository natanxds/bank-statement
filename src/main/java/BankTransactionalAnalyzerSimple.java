import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankTransactionalAnalyzerSimple {
    private static final String RESOURCES = "src/main/resources/";

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(RESOURCES + "transactions.csv");
        // what if file has no lines?
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions =
                new BankStatementCSVParser().parseLinesFromCsv(lines);
        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

        collectSummary(bankStatementProcessor);
    }

    private static void collectSummary(final BankStatementProcessor bankStatementProcessor) {
        System.out.println("The total of all transactions is: " + bankStatementProcessor.calculateTotalAmount());
        System.out.println("The total of all transactions in January is: " +
                bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));
        System.out.println("The total salary received is: " +
                bankStatementProcessor.calculateTotalForCategory("Salary"));
    }
}
