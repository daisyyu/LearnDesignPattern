package behavioral.state.improved;

/**
 * We could save both OPENTCPConnectionState and ClosedTCPConnectionState instances in TCPConnection and use
 * invertion of control to switch objects within TCPConnection state
 */
public class TCPConnection {

    private TCPConnectionState tcpConnectionState = new ClosedTCPConnectionState(this);


    public void open() {
        tcpConnectionState.open();
    }

    public void close() {
        tcpConnectionState.close();
    }

    public void acknowledge() throws Exception {
        tcpConnectionState.acknowledge();
    }


    public void setTcpConnectionState(TCPConnectionState tcpConnectionState) {
        this.tcpConnectionState = tcpConnectionState;
    }
}
