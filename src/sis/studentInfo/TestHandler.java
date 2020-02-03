package sis.studentInfo;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class TestHandler extends Handler {

    private LogRecord record;
    @Override
    public void publish(LogRecord record) {
        this.record = record;
    }
    public String getMessage(){
        return record.getMessage();
    }

    @Override
    public void flush() {
    }

    @Override
    public void close() throws SecurityException {
    }
}
