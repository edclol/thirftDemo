package common;

import org.apache.thrift.TException;
import genjava.*;

/**
 * Created by edc on 2020/8/12
 */
public class HelloWorldImpl implements HelloWorldService.Iface{

    @Override
    public String sayHello(String username) throws TException {
        System.out.println("Server "+ username);
        return "Server -> Clinet";
    }
}
