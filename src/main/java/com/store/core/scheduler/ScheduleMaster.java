package com.store.core.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleMaster {

    private final MicroServiceChecker microServiceChecker;

    public ScheduleMaster(
            MicroServiceChecker microServiceChecker
    ) {
        this.microServiceChecker = microServiceChecker;
    }

    @Scheduled(cron = "0 * * * * ?") // every 1 mint
    public void deleteExpiredOtp() {
    }

    @Scheduled(cron = "0 */1 * * * ?")
    public void runEvery5Minutes(){
        microServiceChecker.checkMicroServices();
    }

    @Scheduled(cron = "0 */5 * * * ?")
    public void runEvery5Hours(){}

    @Scheduled(cron = "0 0 0 * * ?")  // This runs every day at midnight
    public void remove24HoursLog() {}
}
