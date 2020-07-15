package com.ml.common.quartz;

import lombok.Data;

//[秒 分 小时 日 月 周(天) 年(可选参数)]
//每秒
//*/1 * * * * ?

//每分
//0 */1 * * * ?

//每一小时执行一次
//0 0 */1 * * ?

//每天执行一次
//0 15 10 * * ? (每天10点15分执行)

//每月执行一次
//0 15 9 10 * ? (每月10号9点15分执行)

//每周执行一次
//0 15 10 ? * MON (每周一10点15分执行)
//0 10,44 14 ? 3 WED (3月每周三的14:10分到14:44，每分钟运行一次)
//0 15 10 ? * MON-FRI (每周一，二，三，四，五的10:15分运行)
@Data
public class CronExpression {

    /**
     * 所选作业类型:[0混合；1每秒；2每分；3每时；4每天；5每周]
     */
    Integer jobType;

    /**秒[可以用数字0－59 表示]*/
    Integer second;

    /**分[可以用数字0－59 表示]*/
    Integer minute;

    /**时[可以用数字0-23表示]*/
    Integer hour;

    /**天[可以用数字1-31 中的任一一个值，但要注意一些特别的月份]*/
    Integer day;

    /**周[可以用数字1-7表示（1 ＝ 星期日）或用字符口串“SUN, MON, TUE, WED, THU, FRI and SAT”表示]*/
    Integer weeks;

    /**月[可以用0-11 或用字符串  “JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC” 表示]*/
    Integer month;

    /**按[分钟]分段执行*/
    Integer[] minuteArr;

    /**按[小时]分段执行*/
    Integer[] hourArr;

    /**按[天]分段执行*/
    Integer[] dayArr;

}

