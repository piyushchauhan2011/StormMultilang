package org.piyush;

import org.apache.storm.shade.org.apache.commons.io.IOUtils;
import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CommitFeedListener extends BaseRichSpout {
    private SpoutOutputCollector outputCollector;
    private List<String> commits;

    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("commit"));
    }

    public void open(Map map, TopologyContext topologyContext, SpoutOutputCollector outputCollector) {
        this.outputCollector = outputCollector;

//        try {
//            commits = IOUtils.readLines(
//                    ClassLoader.getSystemResourceAsStream("changelog.txt"),
//                    Charset.defaultCharset().name()
//            );
            commits = new LinkedList<String>();
            commits.add("b20ea50 nathan@example.com");
            commits.add("064874b andy@example.com");
            commits.add("28e4f8e andy@example.com");
            commits.add("9a3e07f andy@example.com");
            commits.add("cbb9cd1 nathan@example.com");
            commits.add("0f663d2 jackson@example.com");
            commits.add("0a4b984 nathan@example.com");
            commits.add("1915ca4 derek@example.com");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void nextTuple() {
        for(String commit : commits) {
            outputCollector.emit(new Values(commit));
        }
    }
}
