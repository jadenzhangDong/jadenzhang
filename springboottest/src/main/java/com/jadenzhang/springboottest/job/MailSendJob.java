package com.jadenzhang.springboottest.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;

import java.util.List;

public class MailSendJob implements DataflowJob {
    @Override
    public List fetchData(ShardingContext shardingContext) {
        System.out.println("1111111");
        return null;
    }

    @Override
    public void processData(ShardingContext shardingContext, List list) {

    }
}
