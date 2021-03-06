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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sample configuration for Profile Jobs only. Determines the number of rows on which the Profile job will be executed.
 * If a JobSample value is not provided for profile jobs, the default value will be used. The default value is
 * CUSTOM_ROWS for the mode parameter and 20000 for the size parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/JobSample" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobSample implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether the profile job will be executed on the entire dataset or on a specified number of rows. Must
     * be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FULL_DATASET: Profile job will be executed on the entire dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOM_ROWS: Profile job will be executed on the number of rows specified in the Size parameter.
     * </p>
     * </li>
     * </ul>
     */
    private String mode;
    /**
     * <p>
     * Size parameter is only required when the mode is CUSTOM_ROWS. Profile job will be executed on the the specified
     * number of rows. The maximum value for size is Long.MAX_VALUE.
     * </p>
     * <p>
     * Long.MAX_VALUE = 9223372036854775807
     * </p>
     */
    private Long size;

    /**
     * <p>
     * Determines whether the profile job will be executed on the entire dataset or on a specified number of rows. Must
     * be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FULL_DATASET: Profile job will be executed on the entire dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOM_ROWS: Profile job will be executed on the number of rows specified in the Size parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        Determines whether the profile job will be executed on the entire dataset or on a specified number of
     *        rows. Must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        FULL_DATASET: Profile job will be executed on the entire dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CUSTOM_ROWS: Profile job will be executed on the number of rows specified in the Size parameter.
     *        </p>
     *        </li>
     * @see SampleMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Determines whether the profile job will be executed on the entire dataset or on a specified number of rows. Must
     * be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FULL_DATASET: Profile job will be executed on the entire dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOM_ROWS: Profile job will be executed on the number of rows specified in the Size parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines whether the profile job will be executed on the entire dataset or on a specified number of
     *         rows. Must be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         FULL_DATASET: Profile job will be executed on the entire dataset.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CUSTOM_ROWS: Profile job will be executed on the number of rows specified in the Size parameter.
     *         </p>
     *         </li>
     * @see SampleMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Determines whether the profile job will be executed on the entire dataset or on a specified number of rows. Must
     * be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FULL_DATASET: Profile job will be executed on the entire dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOM_ROWS: Profile job will be executed on the number of rows specified in the Size parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        Determines whether the profile job will be executed on the entire dataset or on a specified number of
     *        rows. Must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        FULL_DATASET: Profile job will be executed on the entire dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CUSTOM_ROWS: Profile job will be executed on the number of rows specified in the Size parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SampleMode
     */

    public JobSample withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Determines whether the profile job will be executed on the entire dataset or on a specified number of rows. Must
     * be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * FULL_DATASET: Profile job will be executed on the entire dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOM_ROWS: Profile job will be executed on the number of rows specified in the Size parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        Determines whether the profile job will be executed on the entire dataset or on a specified number of
     *        rows. Must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        FULL_DATASET: Profile job will be executed on the entire dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CUSTOM_ROWS: Profile job will be executed on the number of rows specified in the Size parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SampleMode
     */

    public JobSample withMode(SampleMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * Size parameter is only required when the mode is CUSTOM_ROWS. Profile job will be executed on the the specified
     * number of rows. The maximum value for size is Long.MAX_VALUE.
     * </p>
     * <p>
     * Long.MAX_VALUE = 9223372036854775807
     * </p>
     * 
     * @param size
     *        Size parameter is only required when the mode is CUSTOM_ROWS. Profile job will be executed on the the
     *        specified number of rows. The maximum value for size is Long.MAX_VALUE.</p>
     *        <p>
     *        Long.MAX_VALUE = 9223372036854775807
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * Size parameter is only required when the mode is CUSTOM_ROWS. Profile job will be executed on the the specified
     * number of rows. The maximum value for size is Long.MAX_VALUE.
     * </p>
     * <p>
     * Long.MAX_VALUE = 9223372036854775807
     * </p>
     * 
     * @return Size parameter is only required when the mode is CUSTOM_ROWS. Profile job will be executed on the the
     *         specified number of rows. The maximum value for size is Long.MAX_VALUE.</p>
     *         <p>
     *         Long.MAX_VALUE = 9223372036854775807
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * Size parameter is only required when the mode is CUSTOM_ROWS. Profile job will be executed on the the specified
     * number of rows. The maximum value for size is Long.MAX_VALUE.
     * </p>
     * <p>
     * Long.MAX_VALUE = 9223372036854775807
     * </p>
     * 
     * @param size
     *        Size parameter is only required when the mode is CUSTOM_ROWS. Profile job will be executed on the the
     *        specified number of rows. The maximum value for size is Long.MAX_VALUE.</p>
     *        <p>
     *        Long.MAX_VALUE = 9223372036854775807
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSample withSize(Long size) {
        setSize(size);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobSample == false)
            return false;
        JobSample other = (JobSample) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public JobSample clone() {
        try {
            return (JobSample) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.JobSampleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
