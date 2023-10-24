package models

import java.util.concurrent.atomic.AtomicInteger

object CountingModel{
    var counter = new AtomicInteger(0)
    def add(): Int = {
        counter.addAndGet(1) 
    }

}
