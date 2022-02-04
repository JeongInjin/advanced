package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

/**
 * 제대로 된 테스트 코드가 아니며, 응답값이 없어 다른 방식으로 값을 검증해야 한다.
 */
class HelloTraceV1Test {

    @Test
    void begin_end() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.end(status);
    }

    @Test
    void begin_exception() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello_exception");
        trace.exception(status, new IllegalStateException());
    }

}