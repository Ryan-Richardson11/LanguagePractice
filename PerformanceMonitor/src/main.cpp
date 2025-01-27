#include <iostream>
#include "PerformanceStats.h"
using namespace std;

// g++ main.cpp PerformanceMonitor.cpp -o main

int main()
{
    PerformanceStats Current;

    Current.DisplayCpuUsage();
    Current.DisplayMemUsage();
    Current.DisplayGpuUsage();
    Current.DisplayDiskUsage();
    Current.DisplayNetworkUsage();

    return 0;
}
