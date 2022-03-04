package cmd.commands;

import picocli.CommandLine;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@CommandLine.Command(
        name = "google", mixinStandardHelpOptions = true,
        description = "Search in Google"
)
public class GoogleSearchCommand implements Runnable {

    private static final String GOOGLE_BASE_URL = "https://google.com";

    @CommandLine.Parameters(
            description = "Search request"
    )
    protected String[] request;

    @Override
    public void run() {
        open(GOOGLE_BASE_URL);
        $("[name=q]").val(String.join(" ", request));
        $("[name=q]").pressEnter();
    }

}
