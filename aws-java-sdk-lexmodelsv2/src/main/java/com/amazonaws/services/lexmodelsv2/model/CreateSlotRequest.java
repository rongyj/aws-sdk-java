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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateSlot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSlotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the slot. Slot names must be unique within the bot that contains the slot.
     * </p>
     */
    private String slotName;
    /**
     * <p>
     * A description of the slot. Use this to help identify the slot in lists.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier for the slot type associated with this slot. The slot type determines the values that can
     * be entered into the slot.
     * </p>
     */
    private String slotTypeId;
    /**
     * <p>
     * Specifies prompts that Amazon Lex sends to the user to elicit a response that provides the value for the slot.
     * </p>
     */
    private SlotValueElicitationSetting valueElicitationSetting;
    /**
     * <p>
     * Determines how slot values are used in Amazon CloudWatch logs. If the value of the
     * <code>obfuscationSetting</code> parameter is <code>DefaultObfuscation</code>, slot values are obfuscated in the
     * log output. If the value is <code>None</code>, the actual value is present in the log output.
     * </p>
     * <p>
     * The default is to obfuscate values in the CloudWatch logs.
     * </p>
     */
    private ObfuscationSetting obfuscationSetting;
    /**
     * <p>
     * The identifier of the bot associated with the slot.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot associated with the slot.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale that the slot will be used in. The string must match one of the
     * supported locales. All of the bots, intents, slot types used by the slot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The identifier of the intent that contains the slot.
     * </p>
     */
    private String intentId;

    /**
     * <p>
     * The name of the slot. Slot names must be unique within the bot that contains the slot.
     * </p>
     * 
     * @param slotName
     *        The name of the slot. Slot names must be unique within the bot that contains the slot.
     */

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    /**
     * <p>
     * The name of the slot. Slot names must be unique within the bot that contains the slot.
     * </p>
     * 
     * @return The name of the slot. Slot names must be unique within the bot that contains the slot.
     */

    public String getSlotName() {
        return this.slotName;
    }

    /**
     * <p>
     * The name of the slot. Slot names must be unique within the bot that contains the slot.
     * </p>
     * 
     * @param slotName
     *        The name of the slot. Slot names must be unique within the bot that contains the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotRequest withSlotName(String slotName) {
        setSlotName(slotName);
        return this;
    }

    /**
     * <p>
     * A description of the slot. Use this to help identify the slot in lists.
     * </p>
     * 
     * @param description
     *        A description of the slot. Use this to help identify the slot in lists.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the slot. Use this to help identify the slot in lists.
     * </p>
     * 
     * @return A description of the slot. Use this to help identify the slot in lists.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the slot. Use this to help identify the slot in lists.
     * </p>
     * 
     * @param description
     *        A description of the slot. Use this to help identify the slot in lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the slot type associated with this slot. The slot type determines the values that can
     * be entered into the slot.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier for the slot type associated with this slot. The slot type determines the values
     *        that can be entered into the slot.
     */

    public void setSlotTypeId(String slotTypeId) {
        this.slotTypeId = slotTypeId;
    }

    /**
     * <p>
     * The unique identifier for the slot type associated with this slot. The slot type determines the values that can
     * be entered into the slot.
     * </p>
     * 
     * @return The unique identifier for the slot type associated with this slot. The slot type determines the values
     *         that can be entered into the slot.
     */

    public String getSlotTypeId() {
        return this.slotTypeId;
    }

    /**
     * <p>
     * The unique identifier for the slot type associated with this slot. The slot type determines the values that can
     * be entered into the slot.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier for the slot type associated with this slot. The slot type determines the values
     *        that can be entered into the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotRequest withSlotTypeId(String slotTypeId) {
        setSlotTypeId(slotTypeId);
        return this;
    }

    /**
     * <p>
     * Specifies prompts that Amazon Lex sends to the user to elicit a response that provides the value for the slot.
     * </p>
     * 
     * @param valueElicitationSetting
     *        Specifies prompts that Amazon Lex sends to the user to elicit a response that provides the value for the
     *        slot.
     */

    public void setValueElicitationSetting(SlotValueElicitationSetting valueElicitationSetting) {
        this.valueElicitationSetting = valueElicitationSetting;
    }

    /**
     * <p>
     * Specifies prompts that Amazon Lex sends to the user to elicit a response that provides the value for the slot.
     * </p>
     * 
     * @return Specifies prompts that Amazon Lex sends to the user to elicit a response that provides the value for the
     *         slot.
     */

    public SlotValueElicitationSetting getValueElicitationSetting() {
        return this.valueElicitationSetting;
    }

    /**
     * <p>
     * Specifies prompts that Amazon Lex sends to the user to elicit a response that provides the value for the slot.
     * </p>
     * 
     * @param valueElicitationSetting
     *        Specifies prompts that Amazon Lex sends to the user to elicit a response that provides the value for the
     *        slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotRequest withValueElicitationSetting(SlotValueElicitationSetting valueElicitationSetting) {
        setValueElicitationSetting(valueElicitationSetting);
        return this;
    }

    /**
     * <p>
     * Determines how slot values are used in Amazon CloudWatch logs. If the value of the
     * <code>obfuscationSetting</code> parameter is <code>DefaultObfuscation</code>, slot values are obfuscated in the
     * log output. If the value is <code>None</code>, the actual value is present in the log output.
     * </p>
     * <p>
     * The default is to obfuscate values in the CloudWatch logs.
     * </p>
     * 
     * @param obfuscationSetting
     *        Determines how slot values are used in Amazon CloudWatch logs. If the value of the
     *        <code>obfuscationSetting</code> parameter is <code>DefaultObfuscation</code>, slot values are obfuscated
     *        in the log output. If the value is <code>None</code>, the actual value is present in the log output.</p>
     *        <p>
     *        The default is to obfuscate values in the CloudWatch logs.
     */

    public void setObfuscationSetting(ObfuscationSetting obfuscationSetting) {
        this.obfuscationSetting = obfuscationSetting;
    }

    /**
     * <p>
     * Determines how slot values are used in Amazon CloudWatch logs. If the value of the
     * <code>obfuscationSetting</code> parameter is <code>DefaultObfuscation</code>, slot values are obfuscated in the
     * log output. If the value is <code>None</code>, the actual value is present in the log output.
     * </p>
     * <p>
     * The default is to obfuscate values in the CloudWatch logs.
     * </p>
     * 
     * @return Determines how slot values are used in Amazon CloudWatch logs. If the value of the
     *         <code>obfuscationSetting</code> parameter is <code>DefaultObfuscation</code>, slot values are obfuscated
     *         in the log output. If the value is <code>None</code>, the actual value is present in the log output.</p>
     *         <p>
     *         The default is to obfuscate values in the CloudWatch logs.
     */

    public ObfuscationSetting getObfuscationSetting() {
        return this.obfuscationSetting;
    }

    /**
     * <p>
     * Determines how slot values are used in Amazon CloudWatch logs. If the value of the
     * <code>obfuscationSetting</code> parameter is <code>DefaultObfuscation</code>, slot values are obfuscated in the
     * log output. If the value is <code>None</code>, the actual value is present in the log output.
     * </p>
     * <p>
     * The default is to obfuscate values in the CloudWatch logs.
     * </p>
     * 
     * @param obfuscationSetting
     *        Determines how slot values are used in Amazon CloudWatch logs. If the value of the
     *        <code>obfuscationSetting</code> parameter is <code>DefaultObfuscation</code>, slot values are obfuscated
     *        in the log output. If the value is <code>None</code>, the actual value is present in the log output.</p>
     *        <p>
     *        The default is to obfuscate values in the CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotRequest withObfuscationSetting(ObfuscationSetting obfuscationSetting) {
        setObfuscationSetting(obfuscationSetting);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot associated with the slot.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the slot.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the slot.
     * </p>
     * 
     * @return The identifier of the bot associated with the slot.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the slot.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot associated with the slot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot associated with the slot.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot associated with the slot.
     * </p>
     * 
     * @return The version of the bot associated with the slot.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot associated with the slot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot associated with the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale that the slot will be used in. The string must match one of the
     * supported locales. All of the bots, intents, slot types used by the slot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the slot will be used in. The string must match one of the
     *        supported locales. All of the bots, intents, slot types used by the slot must have the same locale. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs
     *        .aws.amazon.com/lex/latest/dg/supported-locales.html</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the slot will be used in. The string must match one of the
     * supported locales. All of the bots, intents, slot types used by the slot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     * 
     * @return The identifier of the language and locale that the slot will be used in. The string must match one of the
     *         supported locales. All of the bots, intents, slot types used by the slot must have the same locale. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs
     *         .aws.amazon.com/lex/latest/dg/supported-locales.html</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the slot will be used in. The string must match one of the
     * supported locales. All of the bots, intents, slot types used by the slot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the slot will be used in. The string must match one of the
     *        supported locales. All of the bots, intents, slot types used by the slot must have the same locale. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs
     *        .aws.amazon.com/lex/latest/dg/supported-locales.html</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The identifier of the intent that contains the slot.
     * </p>
     * 
     * @param intentId
     *        The identifier of the intent that contains the slot.
     */

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    /**
     * <p>
     * The identifier of the intent that contains the slot.
     * </p>
     * 
     * @return The identifier of the intent that contains the slot.
     */

    public String getIntentId() {
        return this.intentId;
    }

    /**
     * <p>
     * The identifier of the intent that contains the slot.
     * </p>
     * 
     * @param intentId
     *        The identifier of the intent that contains the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotRequest withIntentId(String intentId) {
        setIntentId(intentId);
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
        if (getSlotName() != null)
            sb.append("SlotName: ").append(getSlotName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSlotTypeId() != null)
            sb.append("SlotTypeId: ").append(getSlotTypeId()).append(",");
        if (getValueElicitationSetting() != null)
            sb.append("ValueElicitationSetting: ").append(getValueElicitationSetting()).append(",");
        if (getObfuscationSetting() != null)
            sb.append("ObfuscationSetting: ").append(getObfuscationSetting()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getIntentId() != null)
            sb.append("IntentId: ").append(getIntentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSlotRequest == false)
            return false;
        CreateSlotRequest other = (CreateSlotRequest) obj;
        if (other.getSlotName() == null ^ this.getSlotName() == null)
            return false;
        if (other.getSlotName() != null && other.getSlotName().equals(this.getSlotName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSlotTypeId() == null ^ this.getSlotTypeId() == null)
            return false;
        if (other.getSlotTypeId() != null && other.getSlotTypeId().equals(this.getSlotTypeId()) == false)
            return false;
        if (other.getValueElicitationSetting() == null ^ this.getValueElicitationSetting() == null)
            return false;
        if (other.getValueElicitationSetting() != null && other.getValueElicitationSetting().equals(this.getValueElicitationSetting()) == false)
            return false;
        if (other.getObfuscationSetting() == null ^ this.getObfuscationSetting() == null)
            return false;
        if (other.getObfuscationSetting() != null && other.getObfuscationSetting().equals(this.getObfuscationSetting()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getIntentId() == null ^ this.getIntentId() == null)
            return false;
        if (other.getIntentId() != null && other.getIntentId().equals(this.getIntentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotName() == null) ? 0 : getSlotName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSlotTypeId() == null) ? 0 : getSlotTypeId().hashCode());
        hashCode = prime * hashCode + ((getValueElicitationSetting() == null) ? 0 : getValueElicitationSetting().hashCode());
        hashCode = prime * hashCode + ((getObfuscationSetting() == null) ? 0 : getObfuscationSetting().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getIntentId() == null) ? 0 : getIntentId().hashCode());
        return hashCode;
    }

    @Override
    public CreateSlotRequest clone() {
        return (CreateSlotRequest) super.clone();
    }

}
