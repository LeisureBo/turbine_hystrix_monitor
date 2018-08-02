# turbine_hystrix_monitor

## basic access description

    Single Hystrix App: http://hystrix-app:port/actuator/hystrix.stream 
    Cluster via Turbine (default cluster): http://turbine-hostname:port/turbine.stream 
    Cluster via Turbine (custom cluster): http://turbine-hostname:port/turbine.stream?cluster=[clusterName]
