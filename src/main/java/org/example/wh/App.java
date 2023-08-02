package org.example.wh;

import picocli.CommandLine;

/**
 * @author wh
 * @create 2023/8/2 21:34
 */
public class App {
    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(JobEntry.class);
        commandLine.execute(args);
    }
}
