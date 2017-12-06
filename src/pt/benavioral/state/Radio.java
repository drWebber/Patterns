package pt.benavioral.state;

public class Radio {
    private Channel channel;

    public Radio() { }
    
    public Radio(Channel channel) {
        this.channel = channel;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
    
    public void nextChannel() {
        if (channel instanceof ChannelDfm) {
            channel = new ChannelAOne();
        } else {
            channel = new ChannelDfm();
        }
    }

    public void play() {
        channel.play();
    }
}
