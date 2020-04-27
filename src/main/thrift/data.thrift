namespace java com.zzsong.netty.thrift.one

typedef  i32 int
typedef  i64 long
typedef  bool boolean
typedef  string String

enum Operation {
     ADD = 1,
     SUBTRACT = 2,
     MULTIPLY = 3,
     DIVIDE = 4
}

struct Work{
    1:int pageNo,
    2:long totalCount,
    3:boolean flag,
    4:Operation op,
    5:String content,
}

exception InvalidException{
    1:int code,
    2:String message,
}

service MyDataService {
    int add(1:int a, 2:int b),
    int cal(1:int id, 2:Work work) throws(1:InvalidException invalid),

}