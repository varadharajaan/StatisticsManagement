package com.n26.Controller;

import com.n26.Service.StatisticsService;
import com.n26.model.Statistics;
import com.n26.model.StatisticsResponse;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Varadharajan on 2019-09-27 23:59
 * @project name: coding-challenge
 */
@RestController
public class StatisticsController {

    private static final Logger logger = LoggerFactory.getLogger(StatisticsController.class);
    private StatisticsService statisticsService;

    @ApiResponses(value = {@ApiResponse(code = 200, message = "statistics formed successfully"),
            @ApiResponse(code = 500, message = "exception occured"),

    })
    @GetMapping(value = "/statistics", produces = "application/json")
    public ResponseEntity<StatisticsResponse> getLatestStatistics() {
        Statistics statistics = this.statisticsService.get();
        logger.debug("all statistics available for last 60n seconds-->{}", statistics);
        return new ResponseEntity<StatisticsResponse>(statisticsService.formStatisticsResponse(statistics), HttpStatus.OK);
    }


    @Autowired
    public void setStatisticsService(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }
}
