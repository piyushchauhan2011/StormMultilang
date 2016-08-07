package org.piyush;

//import util packages

import org.apache.storm.task.ShellBolt;
import org.apache.storm.topology.IRichBolt;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.tuple.Fields;

import java.util.Map;

//import Storm IRichBolt package

//Create a class CallLogCreatorBolt which implement IRichBolt interface
public class CallLogCreatorBolt extends ShellBolt implements IRichBolt {

    public CallLogCreatorBolt() {
        super("python", "call_log_creator_bolt.py");
    }

    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("call", "duration"));
    }

    public Map<String, Object> getComponentConfiguration() {
        return null;
    }
}