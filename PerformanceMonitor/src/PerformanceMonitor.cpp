#include <iostream>
#include "PerformanceStats.h"
using namespace std;

// ===================================
//              Memory
// ===================================
void PerformanceStats::GetMemUsage()
{
    cout << "Mem Usage" << endl;
}

void PerformanceStats::DisplayMemUsage()
{
    GetMemUsage();
}

// ===================================
//              CPU
// ===================================
void PerformanceStats::GetCpuUsage()
{
    cout << "CPU Usage" << endl;
}

void PerformanceStats::DisplayCpuUsage()
{
    GetCpuUsage();
}

// ===================================
//              DISK
// ===================================
void PerformanceStats::GetDiskUsage()
{
    cout << "Disk Usage" << endl;
}

void PerformanceStats::DisplayDiskUsage()
{
    GetDiskUsage();
}

// ===================================
//              GPU
// ===================================
void PerformanceStats::GetGpuUsage()
{
    cout << "GPU Usage" << endl;
}

void PerformanceStats::DisplayGpuUsage()
{
    GetGpuUsage();
}

// ===================================
//              Network
// ===================================
void PerformanceStats::GetNetworkUsage()
{
    cout << "Network Usage" << endl;
}

void PerformanceStats::DisplayNetworkUsage()
{
    GetNetworkUsage();
}
