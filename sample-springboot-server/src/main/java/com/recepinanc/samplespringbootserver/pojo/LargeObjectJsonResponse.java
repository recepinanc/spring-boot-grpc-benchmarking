package com.recepinanc.samplespringbootserver.pojo;

import java.util.List;

public class LargeObjectJsonResponse
{
    List<LargeObjectPOJO> largeObjectPOJOS;

    public List<LargeObjectPOJO> getLargeObjectPOJOS()
    {
        return largeObjectPOJOS;
    }

    public void setLargeObjectPOJOS(List<LargeObjectPOJO> largeObjectPOJOS)
    {
        this.largeObjectPOJOS = largeObjectPOJOS;
    }
}
