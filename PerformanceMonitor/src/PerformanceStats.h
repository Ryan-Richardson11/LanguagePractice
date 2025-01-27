#ifndef PERFORMANCE_STATS_H
#define PERFORMANCE_STATS_H

class PerformanceStats
{
public:
    int MemUsage;
    int CpuUsage;
    int DiskUsage;
    int GpuUsage;
    int NetworkUsage;

    void GetMemUsage();
    void DisplayMemUsage();

    void GetCpuUsage();
    void DisplayCpuUsage();

    void GetDiskUsage();
    void DisplayDiskUsage();

    void GetGpuUsage();
    void DisplayGpuUsage();

    void GetNetworkUsage();
    void DisplayNetworkUsage();
};

#endif
