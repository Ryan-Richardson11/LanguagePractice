// C++ Performance Monitor
#include <iostream>
using namespace std;

class PerformanceStats
{
public:
    int MemUsage;
    int CpuUsage;
    int DiskUsage;
    int GpuUsage;
    int NetworkUsage;

    void GetMemUsage()
    {
        cout << "Mem Usage" << endl;
    }

    void GetCpuUsage()
    {
        cout << "CPU Usage" << endl;
    }

    void GetDiskUsage()
    {
        cout << "Disk Usage" << endl;
    }

    void GetGpuUsage()
    {
        cout << "GPU Usage" << endl;
    }

    void GetNetworkUsage()
    {
        cout << "Network Usage" << endl;
    }
};

int main()
{
}
