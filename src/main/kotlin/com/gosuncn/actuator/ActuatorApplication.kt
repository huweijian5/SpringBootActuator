package com.gosuncn.actuator

import de.codecentric.boot.admin.config.EnableAdminServer
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
open class ActuatorApplication{

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(ActuatorApplication::class.java, *args)
        }
    }
}


