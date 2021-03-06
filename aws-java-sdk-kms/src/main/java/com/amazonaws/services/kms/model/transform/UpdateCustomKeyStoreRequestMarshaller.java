/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateCustomKeyStoreRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateCustomKeyStoreRequestMarshaller {

    private static final MarshallingInfo<String> CUSTOMKEYSTOREID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomKeyStoreId").build();
    private static final MarshallingInfo<String> NEWCUSTOMKEYSTORENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewCustomKeyStoreName").build();
    private static final MarshallingInfo<String> KEYSTOREPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyStorePassword").build();
    private static final MarshallingInfo<String> CLOUDHSMCLUSTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudHsmClusterId").build();

    private static final UpdateCustomKeyStoreRequestMarshaller instance = new UpdateCustomKeyStoreRequestMarshaller();

    public static UpdateCustomKeyStoreRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateCustomKeyStoreRequest updateCustomKeyStoreRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateCustomKeyStoreRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateCustomKeyStoreRequest.getCustomKeyStoreId(), CUSTOMKEYSTOREID_BINDING);
            protocolMarshaller.marshall(updateCustomKeyStoreRequest.getNewCustomKeyStoreName(), NEWCUSTOMKEYSTORENAME_BINDING);
            protocolMarshaller.marshall(updateCustomKeyStoreRequest.getKeyStorePassword(), KEYSTOREPASSWORD_BINDING);
            protocolMarshaller.marshall(updateCustomKeyStoreRequest.getCloudHsmClusterId(), CLOUDHSMCLUSTERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
