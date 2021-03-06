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
package com.amazonaws.services.servermigration.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServerValidationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServerValidationConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> SERVER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("server").build();
    private static final MarshallingInfo<String> VALIDATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("validationId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> SERVERVALIDATIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverValidationStrategy").build();
    private static final MarshallingInfo<StructuredPojo> USERDATAVALIDATIONPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userDataValidationParameters").build();

    private static final ServerValidationConfigurationMarshaller instance = new ServerValidationConfigurationMarshaller();

    public static ServerValidationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServerValidationConfiguration serverValidationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (serverValidationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serverValidationConfiguration.getServer(), SERVER_BINDING);
            protocolMarshaller.marshall(serverValidationConfiguration.getValidationId(), VALIDATIONID_BINDING);
            protocolMarshaller.marshall(serverValidationConfiguration.getName(), NAME_BINDING);
            protocolMarshaller.marshall(serverValidationConfiguration.getServerValidationStrategy(), SERVERVALIDATIONSTRATEGY_BINDING);
            protocolMarshaller.marshall(serverValidationConfiguration.getUserDataValidationParameters(), USERDATAVALIDATIONPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
