package io.bumo.model.request;

/**
 * @Author riven
 * @Date 2018/7/6 12:26
 */
public class TokenAllowanceRequest {
    private String sourceAddress;
    private String contractAddress;
    private String tokenOwner;
    private String spender;

    /**
     * @Author riven
     * @Method getSourceAddress
     * @Params []
     * @Return java.lang.String
     * @Date 2018/7/7 06:26
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * @Author riven
     * @Method setSourceAddress
     * @Params [sourceAddress]
     * @Return void
     * @Date 2018/7/7 06:30
     */
    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    /**
     * @Author riven
     * @Method getContractAddress
     * @Params []
     * @Return java.lang.String
     * @Date 2018/7/6 12:26
     */
    public String getContractAddress() {
        return contractAddress;
    }

    /**
     * @Author riven
     * @Method setContractAddress
     * @Params [contractAddress]
     * @Return void
     * @Date 2018/7/6 12:26
     */
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    /**
     * @Author riven
     * @Method getTokenOwner
     * @Params []
     * @Return java.lang.String
     * @Date 2018/7/6 12:26
     */
    public String getTokenOwner() {
        return tokenOwner;
    }

    /**
     * @Author riven
     * @Method setTokenOwner
     * @Params [tokenOwner]
     * @Return void
     * @Date 2018/7/6 12:26
     */
    public void setTokenOwner(String tokenOwner) {
        this.tokenOwner = tokenOwner;
    }

    /**
     * @Author riven
     * @Method getSpender
     * @Params []
     * @Return java.lang.String
     * @Date 2018/7/6 12:26
     */
    public String getSpender() {
        return spender;
    }

    /**
     * @Author riven
     * @Method setSpender
     * @Params [spender]
     * @Return void
     * @Date 2018/7/6 12:27
     */
    public void setSpender(String spender) {
        this.spender = spender;
    }
}
