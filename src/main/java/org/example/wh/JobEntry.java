package org.example.wh;

import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
/**
 * @author wh
 * @create 2023/8/2 21:37
 */
@Command(name = "entry", description = "任务入口", subcommands = {

})
public class JobEntry implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 0;
    }
}
