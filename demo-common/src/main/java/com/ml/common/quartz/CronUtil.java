package com.ml.common.quartz;

public class CronUtil {

    /**
     *
     *方法摘要：构建Cron表达式
     *@param  cronExpression 实体类
     *@return String
     */
    public static String createCronExpression(CronExpression cronExpression){
        StringBuilder cronExp = new StringBuilder();

        if(null == cronExpression.getJobType()) {
            System.out.println("执行周期未配置" );//执行周期未配置
        }

        if (null != cronExpression.getSecond()
                && null == cronExpression.getMinute()
                && null == cronExpression.getHour()){
            //每隔几秒
            if (cronExpression.getJobType() == 0) {
                cronExp.append("0/").append(cronExpression.getSecond());
                cronExp.append(" ");
                cronExp.append("* ");
                cronExp.append("* ");
                cronExp.append("* ");
                cronExp.append("* ");
                cronExp.append("?");
            }

        }

        if (null != cronExpression.getSecond()
                && null != cronExpression.getMinute()
                && null == cronExpression.getHour()){
            //每隔几分钟
            if (cronExpression.getJobType() == 4) {
                cronExp.append("* ");
                cronExp.append("0/").append(cronExpression.getMinute());
                cronExp.append(" ");
                cronExp.append("* ");
                cronExp.append("* ");
                cronExp.append("* ");
                cronExp.append("?");
            }

        }

        if (null != cronExpression.getSecond()
                && null != cronExpression.getMinute()
                && null != cronExpression.getHour()) {
            //秒
            cronExp.append(cronExpression.getSecond()).append(" ");
            //分
            cronExp.append(cronExpression.getMinute()).append(" ");
            //小时
            cronExp.append(cronExpression.getHour()).append(" ");

            //每天
            if(cronExpression.getJobType() == 1){
                cronExp.append("* ");//日
                cronExp.append("* ");//月
                cronExp.append("?");//周
            }

            //按每周
            else if(cronExpression.getJobType() == 3){
                //一个月中第几天
                cronExp.append("? ");
                //月份
                cronExp.append("* ");
                //周
                Integer[] weeks = cronExpression.getDayArr();
                for(int i = 0; i < weeks.length; i++){
                    if(i == 0){
                        cronExp.append(weeks[i]);
                    } else{
                        cronExp.append(",").append(weeks[i]);
                    }
                }

            }

            //按每月
            else if(cronExpression.getJobType() == 2){
                //一个月中的哪几天
                Integer[] days = cronExpression.getDayArr();
                for(int i = 0; i < days.length; i++){
                    if(i == 0){
                        cronExp.append(days[i]);
                    } else{
                        cronExp.append(",").append(days[i]);
                    }
                }
                //月份
                cronExp.append(" * ");
                //周
                cronExp.append("?");
            }

        }
        else {
            System.out.println("时或分或秒参数未配置" );//时或分或秒参数未配置
        }
        return cronExp.toString();
    }

    /**
     *
     *方法摘要：生成计划的详细描述
     *@param  cronExpression 实体类
     *@return String
     */
    public static String createDescription(CronExpression cronExpression){
        StringBuilder description = new StringBuilder();
        //计划执行开始时间
//      Date startTime = cronExpression.getScheduleStartTime();

        if (null != cronExpression.getSecond()
                && null != cronExpression.getMinute()
                && null != cronExpression.getHour()) {
            //按每天
            if(cronExpression.getJobType() == 1){
                description.append("每天");
                description.append(cronExpression.getHour()).append("时");
                description.append(cronExpression.getMinute()).append("分");
                description.append(cronExpression.getSecond()).append("秒");
                description.append("执行");
            }

            //按每周
            else if(cronExpression.getJobType() == 3){
                if(cronExpression.getDayArr() != null && cronExpression.getDayArr().length > 0) {
                    StringBuilder days = new StringBuilder();
                    for(int i : cronExpression.getDayArr()) {
                        days.append("周").append(i);
                    }
                    description.append("每周的").append(days).append(" ");
                }
                if (null != cronExpression.getSecond()
                        && null != cronExpression.getMinute()
                        && null != cronExpression.getHour()) {
                    description.append(",");
                    description.append(cronExpression.getHour()).append("时");
                    description.append(cronExpression.getMinute()).append("分");
                    description.append(cronExpression.getSecond()).append("秒");
                }
                description.append("执行");
            }

            //按每月
            else if(cronExpression.getJobType() == 2){
                //选择月份
                if(cronExpression.getDayArr() != null && cronExpression.getDayArr().length > 0) {
                    StringBuilder days = new StringBuilder();
                    for(int i : cronExpression.getDayArr()) {
                        days.append(i).append("号");
                    }
                    description.append("每月的").append(days).append(" ");
                }
                description.append(cronExpression.getHour()).append("时");
                description.append(cronExpression.getMinute()).append("分");
                description.append(cronExpression.getSecond()).append("秒");
                description.append("执行");
            }else{
                return  "没有参数";
            }

        }
        return description.toString();
    }

    //参考例子
    public static void main(String[] args) {
        //执行时间：每天的12时12分12秒 start
        CronExpression cronExpression = new CronExpression();

        cronExpression.setJobType(0);//按每秒
        cronExpression.setSecond(30);
        String cropExp = createCronExpression(cronExpression);
        System.out.println(cropExp + ":" + createDescription(cronExpression));

        cronExpression.setJobType(4);//按每分钟
        cronExpression.setMinute(8);
        cropExp = createCronExpression(cronExpression);
        System.out.println(cropExp + ":" + createDescription(cronExpression));

        cronExpression.setJobType(1);//按每天
        Integer hour = 12; //时
        Integer minute = 12; //分
        Integer second = 12; //秒
        cronExpression.setHour(hour);
        cronExpression.setMinute(minute);
        cronExpression.setSecond(second);
        cropExp = createCronExpression(cronExpression);
        System.out.println(cropExp + ":" + createDescription(cronExpression));
        //执行时间：每天的12时12分12秒 end

        cronExpression.setJobType(3);//每周的哪几天执行
        Integer[] dayOfWeeks = new Integer[3];
        dayOfWeeks[0] = 1;
        dayOfWeeks[1] = 2;
        dayOfWeeks[2] = 3;
        cronExpression.setDayArr(dayOfWeeks);
        cropExp = createCronExpression(cronExpression);
        System.out.println(cropExp + ":" + createDescription(cronExpression));

        cronExpression.setJobType(2);//每月的哪几天执行
        Integer[] dayOfMonths = new Integer[3];
        dayOfMonths[0] = 1;
        dayOfMonths[1] = 21;
        dayOfMonths[2] = 13;
        cronExpression.setDayArr(dayOfMonths);
        cropExp = createCronExpression(cronExpression);
        System.out.println(cropExp + ":" + createDescription(cronExpression));

    }

}

